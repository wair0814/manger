package cn.liwei08.mapper;

import cn.liwei08.entity.TbUrl;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUrlMapper {
    @Select({"select title,base_url from tb_url"})
    @Results({
//            @Result(column = "id", property = "id", id = true),
            @Result(column = "base_url", property = "baseUrl"),
//            @Result(column = "chapter_find", property = "chapterFind"),
//            @Result(column = "for_fearch", property = "forFearch"),
//            @Result(column = "movie_find", property = "movieFind"),
//            @Result(column = "pin_yin_title", property = "pinYinTitle"),
//            @Result(column = "search_find", property = "searchFind"),
//            @Result(column = "search_url", property = "searchUrl"),
            @Result(column = "title", property = "title"),
//            @Result(column = "weight", property = "weight")
    })
    List<TbUrl> queryTbUrl();
}