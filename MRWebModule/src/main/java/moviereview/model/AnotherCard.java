package moviereview.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by SilverNarcissus on 2017/5/5.
 * This class is used to test hibernate helper
 */
@Entity
public class AnotherCard {
    @Id
    private int No;

    private String name;

    public AnotherCard() {
    }

    public AnotherCard(int no, String name) {
        No = no;
        this.name = name;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}