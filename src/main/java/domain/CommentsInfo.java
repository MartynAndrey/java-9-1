package domain;

public class CommentsInfo {
    private int id;                 //идентификатор коммента
    private int ownerId;            //идентификатор автора коммента
    private String text;            //текст коммента
    private LikeInfo[] likeInfo;    //массив лайков к комменту

    //getters + setters
}
