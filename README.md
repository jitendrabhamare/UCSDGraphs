# UCSDGraphs

## Overview
- The aim of the project is to build a mapping application with the ability to provide and visualize routes from one point to another in a map. 
- The code being developed is what’s called **“back-end”** code, in that I worked with road data, but not directly with the front-end interface. The ideas is to implement **Graph Algorithms** that fit firmly into this back-end functionality. However, a front end map interface that uses the Google Maps API is provided. 
- The project really looks and feels like Google Maps, However it is quite primitive compared to the real Google Maps!

### Project learning outcomes
- Design classes to implement a graph in Java
- Implement basic graph search algorithms including **breadth first search, Dijkstra's Algorithm**, and **A\* Search**.
- Work with real-world geographic road data


## Implementation

### 1. Design and Implement MapGraph Class for real street data

- Design and implement a set of classes that will represent the graph structure that stores the street data and to use these classes to implement MapGraph.
- MapGraph is a directed graph that represents the road connections between intersections. Vertices in a MapGraph are GeographicPoints (latitude, longitude pairs) that correspond to intersections or dead ends between roads, while the edges are the road segments between these intersections.

### 2. Implement Shortest path algorithm using BFS
- Design a shortest path algorithm that performs BFS starting at start until it reaches goal and returns a list of geographic points along the shortest (unweighted) path from start to goal.

#### Implementation Results with Front-end GUI 
#### A. Load Map and Show Intersection 
<kbd>![Alt gif1](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/bfs-show-intersections.gif)</kbd>

#### B. Show Shortest Point between stand and goal using BFS
<kbd>![Alt gif2](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/bfs-show-route.gif)</kbd>

#### C. Visualize BFS Implementation
<kbd>![Alt gif2](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/bfs-visualize.gif)</kbd>


#### code
- [src/roadgraph/MapNode.java](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapNode.java)
- [src/roadgraph/MapEdge.java](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapEdge.java)
- [src/roadgraph/MapGraph.java](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapGraph.java)
