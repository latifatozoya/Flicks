package com.app.latifat.flicks.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Config {

    //the base url for loading images
    String imageBasedUrl;
    //the poster size to use when fetching images, part of the URL
    String posterSize;

    public Config(JSONObject object) throws JSONException {

        JSONObject images = object.getJSONObject("images");
        //get the image base url
        imageBasedUrl = images.getString("secure_base_url");
        //get poster size
        JSONArray posterSizeOptions = images.getJSONArray("poster_sizes");
        // use the option at index 3 or w342 as a fallback
        posterSize = posterSizeOptions.optString(3, "w342");

    }

    //helper method for creating urls
    public String getImageUrl(String size, String path) {
        return String.format("%s%s%s", imageBasedUrl, size, path); //concatenate all three
    }

    public String getImageBasedUrl() {
        return imageBasedUrl;
    }

    public String getPosterSize() {
        return posterSize;
    }
}
