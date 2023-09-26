public class Music {
    private String title;
    private Artist artist;
    private double duration;
    private String albumName;
    private Date mfcdate;

Music(String title,Artist artist,double duration,String albumName,Date mfcdate){
    this.title= title;
    this.artist= artist;
    this.duration= duration;
    this.albumName= albumName;
    this.mfcdate= mfcdate;

}
public void settitle(String title){
    this.title= title;
}
public String gettitle(){
    return title;
}
public void setartist(Artist artist){
    this.artist= artist;
}
public Artist getartist(){
    return artist;
}
public void setduration(double duration){
    this.duration= duration;
}
public double getduration(){
    return duration;
}
public void setalbumN(String Aname){
    this.albumName= Aname;
}
public String getalnumN(){
    return albumName;
}
public void setmfcdate(Date mfcdate){
    this.mfcdate= mfcdate;
}
public Date getmfcdate(){
    return mfcdate;
}
public String toString(){
    String music = String.format("%-20s%-10s   %.2f     %-10s%-10s",title,artist,duration,albumName,mfcdate);
        return music;
}
public boolean equals(Object o){
    Music song = (Music) o;
    if(song.getartist().getname().equals(this.artist.getname())){
        return true;

    }else{
        return false;
    }

}

}