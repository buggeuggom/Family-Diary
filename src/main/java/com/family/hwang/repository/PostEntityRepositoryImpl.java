package com.family.hwang.repository;

import com.family.hwang.controller.request.post.PostSearch;
import com.family.hwang.model.entity.PostEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.family.hwang.model.entity.QPostEntity.*;


@RequiredArgsConstructor
public class PostEntityRepositoryImpl implements PostEntityRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<PostEntity> getList(PostSearch postSearch) {
        return jpaQueryFactory.selectFrom(postEntity)
                .limit(postSearch.getSize())
                .offset(postSearch.getOffset())
                .orderBy(postEntity.id.desc())
                .fetch();
    }
}
