package com.example.m14x.retrofitrecyclerview_itunes.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by m14x on 04/18/2016.
 */
public class ResponseServer {
    private Integer resultCount;
    private List<Pojo> results = new ArrayList<Pojo>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The resultCount
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     *
     * @param resultCount
     * The resultCount
     */
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    /**
     *
     * @return
     * The results
     */
    public List<Pojo> getResults() {
        return results;
    }

    /**
     *
     * @param results
     * The results
     */
    public void setResults(List<Pojo> results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "ResponseServer{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

}
