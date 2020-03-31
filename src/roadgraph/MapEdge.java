/* *
 * @author Jitendra Bhamare
 * 
 * A class to represent a connecting road between two MapNodes 
 * Contains following information
 * - location of start MapNode
 * - location of end MapNode
 * - Street Name
 * - Street Type
 * - distance between start and end MapNode
 * 
 * */

package roadgraph;

import geography.GeographicPoint;


public class MapEdge {
	
	// -----------------------------------------------------
	//			Member Variables
	// -----------------------------------------------------
	private GeographicPoint start;
	private GeographicPoint end;
	private String name;
	private String type;
	private double distance;
	
	// -----------------------------------------------------
	//			Constructors
	// -----------------------------------------------------
	
	/* Create an empty MapEdge */
	public MapEdge() {	
	}
	
	
	/* Create a MapEdge from following info.
	 * @param start
	 * @param end
	 * @param name 
	 * @param distance 
	 */
	public MapEdge(GeographicPoint end1, GeographicPoint end2, String roadName, 
			String roadType, double length) {
		this.start = end1;
		this.end = end2;
		this.name = roadName;
		this.type = roadType;
		this.distance = length;		
	}
	
	// -----------------------------------------------------
	//			Member Methods
	// -----------------------------------------------------
	
	/** Getter for start point 
	 * @return start
	 * */
	public GeographicPoint getStartPoint() {
		return this.start;
	}
	
	/** Getter for end point 
	 * @return endf
	 * */
	public GeographicPoint getEndPoint() {
		return this.end;
	}
	
	/** Getter for road name 
	 * @return name of a road
	 * */
	public String getName() {
		return this.name;
	}
	
	/** Getter for road type 
	 * @return type of a road
	 * */
	public String getType() {
		return this.type;
	}
	
	/** Getter for distance b/w stand and end point
	 * @return distance 
	 *  */
	public double getDistance() {
		return this.distance;
	}
	
	/** Print MapEdge Attributes
	 * @return s - information of MapEdge	  
	 */
	public String toString() {
		String s = "MapEdge Attributes: \n" ;
		s += "\tstartPoint: " + getStartPoint() + ",\n";
		s += "\tendPoint: " + getEndPoint() + ",\n";
		s += "\tStreetName: " + getName() + ",\n";
		s += "\tStreetType: " + getType() + ",\n";
		s += "\tdistance: " + getDistance();
		s += "\n";
		
		return s;
	}
	

}
