package teo.example.com.data.api.entities;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import teo.example.com.data.api.MoviesService;

/**
 * Models the response of GET "/movies/popular" service
 * from {@link MoviesService}.
 */

public class MoviesResponse implements Serializable {

    private MoviesNestedItemResultsResponse[] results;
    private int page;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("total_results")
    private int totalResults;

    public MoviesNestedItemResultsResponse[] getResults() {
        return results;
    }

    public void setResults(MoviesNestedItemResultsResponse[] results) {
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}