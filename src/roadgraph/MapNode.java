/* *
 * @author Jitendra Bhamare
 * 
 * A class to represent an intersection of a graph (or a vertex) 
 * Contains information of location of an intersection and 
 * list of all roads connected 
 * 
 * */

package roadgraph;
import geography.GeographicPoint;
import java.util.List;
import java.util.ArrayList;

public class MapNode implements Comparable<MapNode>{

	// -----------------------------------------------------
	//			Member Variables
	// -----------------------------------------------------
	private GeographicPoint location;
	private List<MapEdge> roadList;
	private List<MapNode> neighbors;
	private Double distance;
	private Double heuristicCost;
	private boolean astarFlag;
	
	// -----------------------------------------------------
	//			Constructors
	// -----------------------------------------------------
	
	/** Create an empty MapNode 
	 * */
	public MapNode() {
		this.location = null;
		this.roadList = new ArrayList<MapEdge>();
		this.neighbors = new ArrayList<MapNode>();
		this.distance = null;
		this.heuristicCost = null;
		this.astarFlag = false;
	}
	
	/** Create a MapNode with a given location
	 * and add empty list of all roads connected and neighbors
	 */
	public MapNode(GeographicPoint loc) {
		this.location = loc;
		this.roadList = new ArrayList<MapEdge>();
		this.neighbors = new ArrayList<MapNode>();
		this.distance = null;
		this.heuristicCost = null;
		this.astarFlag = false;		
	}
	
	// -----------------------------------------------------
	// 			Member Methods
	// -----------------------------------------------------
	
	/** Getter for a location of MapNode 
	 * @return location
	 */
	public GeographicPoint getLocation() {
		return this.location;
	}
	
	/** Getter for a list of all roads connected to the MapNode 
	 * @return roadList
	 */
	public List<MapEdge> getRoadList() {
		return this.roadList;
	}
	
	/** Getter for a list of all neighbors connected to the MapNode 
	 * @return neighbors 
	 */
	public List<MapNode> getNeighbors() {
		return this.neighbors;
	}
	
	/** Getter for a distance of the MapNode 
	 * @return distance 
	 */
	public Double getDistance() {
		return this.distance;
	}
	
	/** Setter for a distance of the MapNode 
	 * @param Double distanceVal 
	 */
	public void setDistance(Double DistVal) {
		this.distance = DistVal;
	}
	
	/** Getter for a heuristicCost of the MapNode 
	 * @return distance 
	 */
	public Double getHCost() {
		return this.heuristicCost;
	}
	
	/** Setter for a distance of the MapNode 
	 * @param Double distanceVal 
	 */
	public void setHCost(MapNode other) {
		this.heuristicCost = this.location.distance(other.getLocation());		
	}
	
	public void setAstar() {
		this.astarFlag = true;
	}
	
	/** Print MapNode Attributes
	 * @return s - information of MapNode	  
	 */
	public String toString() {
		String s = "location of MapNode: " + this.location;
		s += "\nRoad List: \n";
		for (MapEdge e: this.roadList) {
			s += e;
		}
		
		return s;
	}
	
	@Override
    public int compareTo(MapNode other) {
		if (this.astarFlag) {
			Double this_cost = this.getHCost() + this.getDistance();
			Double other_cost = other.getHCost() + other.getDistance();
			
			return this_cost.compareTo(other_cost);			
		}
		
		return this.getDistance().compareTo(other.getDistance());
	}
	
}
