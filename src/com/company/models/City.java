package com.company.models;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class City {
    private String name;
    private List<City> shortestPath = new LinkedList<>();
    private Integer distance = 200000;
    Map<City, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(City destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAdjacentNodes(Map<City, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public Map<City, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setShortestPath(List<City> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public List<City> getShortestPath() {
        return shortestPath;
    }
}
