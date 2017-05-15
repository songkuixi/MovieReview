import request from '../utils/request';

import { GENRES } from '../constants';

export function fetchQuantityInGenre() {

  var data = [];

  GENRES.map((genre) => {
    data.push({
      genre: genre,
      quantity: Math.ceil(Math.random() * 200),
    });
  });
  return {data};

}

export function fetchGenreQuantityScoreInYear() {
  var data = [];

  for (let i = 2000; i <= 2017; i++) {
    data.push({
      year: i,
      count: Math.ceil(Math.random() * 200),
      score: Math.random() * 10,
    })
  }
  return {data};

}


/**
 * Created by Sorumi on 17/5/15.
 */
