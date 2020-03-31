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

public class MapNode {

	// -----------------------------------------------------
	//			Member Variables
	// -----------------------------------------------------
	private GeographicPoint location;
	private List<MapEdge> roadList;
	private List<MapNode> neighbors;
	
	// -----------------------------------------------------
	//			Constructors
	// -----------------------------------------------------
	
	/** Create an empty MapNode 
	 * */
	public MapNode() {
		this.location = null;
		this.roadList = new ArrayList<MapEdge>();
		this.neighbors = new ArrayList<MapNode>();
	}
	
	/** Create a MapNode with a given location
	 * and add empty list of all roads connected and neighbors
	 */
	public MapNode(GeographicPoint loc) {
		this.location = loc;
		this.roadList = new ArrayList<MapEdge>();
		this.neighbors = new ArrayList<MapNode>();
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
	
}
