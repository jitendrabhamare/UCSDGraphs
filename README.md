# Route Planning with Graph Algorithms

[![Java](https://img.shields.io/badge/Language-Java-blue.svg)](https://www.java.com)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Coursera](https://img.shields.io/badge/Coursera-Advanced%20Data%20Structures-brightgreen.svg)](https://www.coursera.org/learn/advanced-data-structures)

**Route Planning with Graph Algorithms** is a Java-based mapping application that calculates and visualizes routes between geographic points using classical graph algorithms. Built as part of UCSD’s [Advanced Data Structures in Java](https://www.coursera.org/learn/advanced-data-structures) course on Coursera, this project demonstrates real-world graph theory applications via an interactive map interface powered by the Google Maps API.

---
## Table of Contents

- [Features](#features)
- [About the Project](#about-the-project)
  - [Learning Objectives](#learning-objectives)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Application](#running-the-application)
- [Implementation Highlights](#implementation-highlights)
  - [Graph Structure & Node Design](#1-graph-structure--node-design)
  - [Breadth-First Search (BFS)](#2-breadth-first-search-bfs)
  - [Dijkstra’s Algorithm](#3-dijkstras-algorithm)
  - [A* Search](#4-a-search)
- [Source Code Overview](#source-code-overview)
- [Contributing](#contributing)
- [Credits](#credits)
- [License](#license)
- [Support](#support)
  
---

## Features

- Compute shortest paths using **Breadth-First Search (BFS)**, **Dijkstra’s Algorithm**, and **A\* Search**
- Interactive route visualization on Google Maps
- Real-world road data integration with Java and JavaFX frontend

---

## About the Project

This project emphasizes algorithmic problem-solving through route planning, integrating backend graph logic with a frontend Google Maps interface. It’s a simplified but educational alternative to commercial mapping systems, focusing on algorithm design over production-grade UX.

### Learning Objectives

- Implement graph structures and traversal algorithms from scratch in Java
- Understand trade-offs between different shortest path algorithms
- Visualize algorithm performance and pathfinding behavior in real geographic contexts

---

## Getting Started

### Prerequisites

- **Java 8 or higher** – [Download here](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Maven** – Dependency and build manager ([Install guide](https://maven.apache.org/install.html))
- **Google Maps API Key** – Get one [here](https://developers.google.com/maps/documentation/javascript/get-api-key)
- **Eclipse IDE** (optional) – or use any Java IDE of your choice

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/jitendrabhamare/UCSDGraphs.git
   ```

2. **Navigate to the project directory**
   ```bash
   cd UCSDGraphs
   ```

3. **Set your Google Maps API key**

   Create the following file if it doesn't exist:
   ```properties
   # File: src/main/resources/config.properties
   google.maps.api.key=YOUR_API_KEY
   ```

4. **Build the project**
   ```bash
   mvn clean install
   ```

### Running the Application

1. Launch the JavaFX application:
   ```bash
   java -jar target/UCSDGraphs-1.0-SNAPSHOT.jar
   ```

2. Open `http://localhost:8080` in your browser to interact with the map interface.

---

## Implementation Highlights

### 1. **Graph Structure & Node Design**

Custom `MapGraph` class represents the map:
- Nodes: `GeographicPoint` intersections
- Edges: directed, weighted road segments

🔍 *Demo: Visualizing loaded intersections on the map*  
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/bfs-show-intersections.gif" width="800"/></kbd>

---

### 2. **Breadth-First Search (BFS)**

BFS is used for unweighted shortest path discovery.

- **Time Complexity**: ```O(V + E)```
- **Space Complexity**: ```O(V)```
- **Optimal**: Yes, for unweighted graphs
- **Use Case**: Scenarios where edge weights are irrelevant (e.g., basic pathfinding, board games)

🧭 *Demo: BFS explores shortest unweighted path*  
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/bfs-visualize.gif" width="800"/></kbd>

---

### 3. **Dijkstra’s Algorithm**

Dijkstra computes shortest paths on weighted graphs with non-negative edge costs.

- **Time Complexity**: ```O((V + E) log V)``` with priority queue
- **Space Complexity**: ```O(V)```
- **Optimal**: Yes
- **Use Case**: GPS routing where travel distances or times differ across roads

🛣️ *Demo: Dijkstra’s algorithm finds optimal weighted paths*  
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/dijkstra-visualize.gif" width="800"/></kbd>

---

### 4. **A\* Search**

A* uses heuristics to prioritize promising paths, reducing unnecessary exploration.

- **Time Complexity**: ```O((V + E) log V)``` (average case)
- **Space Complexity**: ```O(V)```
- **Optimal**: Yes, with admissible heuristics (e.g., straight-line distance)
- **Use Case**: Real-time routing with performance constraints (e.g., robotics, games)

🧠 *Demo: A* efficiently finds optimal route using heuristics*  
<kbd><img src="https://github.com/jitendrabhamare/UCSDGraphs/blob/master/gif/astar2-visualize.gif" width="800"/></kbd>

---

## Source Code Overview

### Core Graph Logic

- [`MapGraph.java`](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapGraph.java) – Graph structure and algorithm implementations
- [`MapNode.java`](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapNode.java) – Node representation
- [`MapEdge.java`](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/roadgraph/MapEdge.java) – Edge representation

### Utilities & Data Models

- [`GeographicPoint.java`](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/geography/GeographicPoint.java)
- [`RoadSegment.java`](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/geography/RoadSegment.java)
- [`GraphLoader.java`](https://github.com/jitendrabhamare/UCSDGraphs/blob/master/src/util/GraphLoader.java)

---

## Contributing

Contributions are welcome! To contribute:

1. Fork this repository  
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit and push your changes  
4. Open a pull request with a detailed description

---

## Credits

- **Course & Starter Code**: UCSD MOOC Team  
  *(Mia Minnes, Christine Alvarado, Leo Porter, Alec Brickner, Adam Setters)*
- **Project Implementation**: [Jitendra Bhamare](https://github.com/jitendrabhamare)

---

## License

Licensed under the MIT License. See the [LICENSE](LICENSE) file for full details.

---

## Support

For questions or issues, feel free to [open an issue](https://github.com/jitendrabhamare/UCSDGraphs/issues) or contact via email:  
📧 **jitendra@email.com**
