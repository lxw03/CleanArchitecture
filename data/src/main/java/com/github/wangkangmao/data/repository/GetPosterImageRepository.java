package com.github.wangkangmao.data.repository;

import com.github.wangkangmao.domain.base.Repository;

import rx.Observable;

/**
 * @author wangkangmao
 * @desc 获取图片数据
 * @date 2017/3/29 11:43
 * @email: kangmao.wang.@foxmail.com
 */
public class GetPosterImageRepository implements Repository<String> {
    @Override
    public Observable<String> getObservable() {

        return Observable.just("http://i.imgur.com/idojSYm.png");
    }
}
