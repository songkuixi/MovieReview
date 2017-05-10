import React, { Component } from 'react';
import { Card, Rate } from 'antd';
import styles from './MovieCard.css';

class MovieCardSmall extends Component {


  render() {
    const example = "https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png";
    return (
      <Card className={styles.card + ' ' + styles.card_small}>
        <div className={styles.img_wrapper}>
          <div className={styles.img} style={{ backgroundImage: `url(${example})`}}></div>
        </div>
        <div className={styles.text}>
          <h3>Europe Street beat</h3>
          <Rate className={styles.rate} disabled allowHalf defaultValue={3.5} />
        </div>
      </Card>
    );
  }
}

export default MovieCardSmall;
