package com.app.latifat.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;


@Parcel
public class Movie {

    //values from API
    String title;
    String overview;
    String posterPath; //only the path
    String backdropPath;
    Double voteAverage;
    String language;
    String release_date;

    // no-arg, empty constructor required for Parceler
    public Movie() {}

    public String getLanguage() {
        return language;
    }

    public String getRelease_date() {
        return release_date;
    }

    //initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
        language = object.getString("original_language");
        release_date = object.getString("release_date");
    }

    public Movie(String title, String overview, String posterPath, String backdropPath, Double voteAverage) {
        this.title = title;
        this.overview = overview;
        this.posterPath = posterPath;
        this.backdropPath = backdropPath;
        this.voteAverage = voteAverage;

    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }
}
