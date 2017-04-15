package vo;

import static util.EqualJudgeHelper.judgeEqual;

/**
 * Created by vivian on 2017/3/3.
 */
public class ScoreDistributionVO {

    /**
     * 评分总数
     */
    int totalAmount;

    /**
     * 各级评分数量
     * size = 5
     * [0]: 1分数量
     * [1]: 2分数量
     * [2]: 3分数量
     * [3]: 4分数量
     * [4]: 5分数量
     */
    int[] reviewAmounts;

    public ScoreDistributionVO(int totalAmount, int[] reviewAmounts) {
        this.totalAmount = totalAmount;
        this.reviewAmounts = reviewAmounts;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int[] getReviewAmounts() {
        return reviewAmounts;
    }

    public void setReviewAmounts(int[] reviewAmounts) {
        this.reviewAmounts = reviewAmounts;
    }

    @Override
    public int hashCode() {
        return totalAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ScoreDistributionVO) {
            ScoreDistributionVO scoreDistributionVO = (ScoreDistributionVO) o;
            return compareData(scoreDistributionVO);
        }
        return false;
    }

    private boolean compareData(ScoreDistributionVO scoreDistributionVO) {
        return judgeEqual(totalAmount, scoreDistributionVO.getTotalAmount())
                && judgeEqual(reviewAmounts, scoreDistributionVO.getReviewAmounts());
    }

    @Override
    public String toString() {
        int count = reviewAmounts.length;
        String string = "*******************************\n";
        string += "total: " + totalAmount + " \n";
        for (int i = 0; i < count; i++) {
            string += i + " " + reviewAmounts[i] + "\n";
        }
        string += "*******************************";
        return string;
    }
}
