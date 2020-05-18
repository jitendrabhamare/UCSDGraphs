# UCSDGraphs

## Introduction
The project is part of MOOC course '[Advanced Data Structures in Java](https://www.coursera.org/learn/advanced-data-structures)' under Specialization **'Object Oriented Java Programming: Data Structures and Beyond'** offered by University of California, San Diego. The aim of the project is to build a map application with the ability to provide and visualize routes from one point to another in a map.

GUI Application developed in the MOOC Course and starter code authored by UCSD MOOC Team: Mia Minnes, Christine Alvarado, Leo Porter, Alec Brickner and Adam Setters.<br/>
Additionally, a runnable **JavaFX** program which will help to test and demonstrate the implementations.

## Overview
- The code being developed is what’s called **“back-end”** code, in that I worked with road data, but not directly with the front-end interface. The ideas is to implement **Graph Algorithms** that fit firmly into this back-end functionality. However, a front end map interface that uses the Google Maps API is provided. 
- The project really looks and feels like Google Maps, However it is quite primitive compared to the real Google Maps!

### Project learning outcomes
- Architect and design classes to implement a graph in Java.
- Implement graph search algorithms including **breadth first search, Dijkstra's Algorithm**, and **A\* Search**. 
- Work with real-world geographic road data and visualize routes from start point and end point. 

## Implementation Steps

### 1. Design and Implement MapGraph Class for real street data

- Design and implement a set of classes that will represent the graph structure that stores the street data and to use these classes to implement MapGraph.
- MapGraph is a directed graph that represents the road connections between intersections. Vertices in a MapGraph are GeographicPoints (latitude, longitude pairs) that correspond to intersections or dead ends between roads, while the edges are the road segments between these intersections.

#### Load Map and Show Intersection 
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/bfs-show-intersections.gif" alt="gif1" width="800" border="1"/></kbd>

### 2. Implement Shortest path algorithm using Breadth-First Search (BFS)
- Design a shortest path algorithm that performs BFS starting at start until it reaches goal and returns a list of geographic points along the shortest (unweighted) path from start to goal.
- Please note that the BFS algorithm treats distance between each two intersections as 1 unit, hence it's not accuate for real life graphs. 

#### Visualize BFS Implementation
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/bfs-visualize.gif" alt="gif2" width="800"/></kbd>

### 2. Implement Dijkstra's Shortest Path Algorithm 

#### Visualize Dijkstra's Algorithm Implementation
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/dijkstra-visualize.gif" alt="dijkstra-gif" width="800"/></kbd>

### 4. Implement A* Shortest Path Algorithm
#### Visualize A* Algorithm Implementation
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/astar2-visualize.gif" alt="astar-gif" width="800"/></kbd>

#### Utility files
- geography.GeographicPoint.java
- geography.RoadSegment.java
- util.GraphLoader.java

#### code
- [src/roadgraph/MapNode.java](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapNode.java)
- [src/roadgraph/MapEdge.java](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapEdge.java)
- [src/roadgraph/MapGraph.java](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapGraph.java)

#### Setup
Importing Project into **eclipse**:

Create a new Java Project in your workspace<br/>
Import the starter files:
File -> Import -> Select "File System" -> Next -> Browse and set root directory to folder contents of zip were extracted to -> Finish

Feel free to use another IDE or manually compile and run your programs.

If you need help, google is your friend.
