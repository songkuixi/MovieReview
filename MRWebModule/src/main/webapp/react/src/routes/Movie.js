import React from 'react';
import { connect } from 'dva';
import styles from './Movie.css';

import MainLayout from '../components/MainLayout/MainLayout';
import MovieBanner from '../components/Movie/MovieBanner';
import MovieInfo from '../components/Movie/MovieInfo';
import ReviewList from '../components/ReviewList/ReviewList';

function Movie() {
  return (
    <MainLayout location={location}>
      <div className={styles.normal}>
        <MovieBanner/>
        <MovieInfo/>
        <ReviewList/>
      </div>
    </MainLayout>
  );
}

function mapStateToProps() {
  return {};
}

export default connect(mapStateToProps)(Movie);