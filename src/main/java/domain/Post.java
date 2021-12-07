package domain;

import java.util.Date;
import java.util.Objects;

public class Post {
    private int id;                             //идентификатор поста
    private Date publicationDate;               //дата публикации
    private int ownerId;                        //идентификатор автора поста
    private String text;                        //текст поста
    private MediaContent[] media;               //массив из приложенного к посту медиаконтента (картинок/видео)
    private String detailLink;                  //ссылка "Подробно" на пост целиком или на страницу в интернете
    private boolean isFixed;                    //true - если пост закреплен
    private boolean isCommented;                //true - если разрешены комментарии к посту
    private CommentsInfo[] commentsInfo;        //массив комментариев к посту
    private boolean isShowCommentsUnderPost;    //true - если комментарии должны выводиться под постом на стене
    private LikeInfo[] likeInfo;                //массив лайков к посту
    private int shareCount;                     //количество поделившихся постом
    private int viewCount;                      //количество просмотров поста

    //getters + setters
}