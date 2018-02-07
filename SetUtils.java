package unl.cse.utils;


import java.util.HashSet;
import java.util.Set;

public class SetUtils {

	/**
	 * Returns all the elements in the set <code>a</code> without any of the
	 * elements in <code>b</code>.
	 * 
	 * This is an example of a generic set usage; this method has been done for
	 * you
	 * 
	 * @param a
	 *            The first set
	 * @param b
	 *            The second set
	 * @return The set minus of a - b
	 */
	public static <T> Set<T> setMinus(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>();

		result.addAll(a);
		for (T element : b) {
			result.remove(element);
		}
		return result;
	}

	/**
	 * This method returns a new set which is the union of the two given sets.
	 * 
	 * @param a
	 * @param b
	 * @return The union of <code>a</code> and <code>b</code>
	 */
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		return null;
	}

	/**
	 * This method returns a new set which is the intersection of the two given
	 * sets.
	 * 
	 * @param a
	 * @param b
	 * @return The intersection of <code>a</code> and <code>b</code>
	 */
	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		return null;
	}

	/**
	 * This method computers the power set of the given set <code>a</code>,
	 * returning a set of sets of elements.
	 * 
	 * @param a
	 * @return The power set of <code>a</code>
	 */
	public static <T> Set<Set<T>> getPowerSet(Set<T> inputSet) {
		Set<Set<T>> p = new HashSet<Set<T>>();
		int n = getCardinality(inputSet);
		double bincov = Math.pow(2, n) - 1;
		
		//for each potential binary number up to (2^n)-1
		for(Integer i=0; i<(int)bincov; i++){
			//convert i to binary
			String b = Integer.toBinaryString((int)i);
			/**************************************
			//need something to pad with zeroes here
			***************************************/
			Set<T> a = new HashSet<T>();
			int j = 0;
			//go through and add where "1"s appear in the binary
			for(T element : inputSet){
				if(b.charAt(j) == '1'){
					a.add(element);
				j++;					
				}
			}
			//add resulting set to p
			p.add(a);
		}	
		return p;
	}
	

	/**
	 * Returns a set containing all subsets of the given set <code>a</code> that
	 * have cardinality <code>size</code>.
	 * 
	 * @param a
	 * @param size
	 * @return
	 */
	public static <T> Set<Set<T>> getSetsOfCardinality(Set<T> a, int size) {
		Set<Set<T>> setsOfCardinality = new HashSet<Set<T>>();
		
		Set<Set<T>> powerSet = new HashSet<Set<T>>();
		powerSet.addAll(getPowerSet(a));
		
		for(Set<T> element : powerSet){
			if(getCardinality(element) == size){
				setsOfCardinality.add(element);
			}
		}	
		
		return setsOfCardinality;
	}
	
	public static <T> int getCardinality(Set<T> a){
		return a.size();
	}

	/**
	 * Returns the symmetric difference of the two given sets, defined as all
	 * elements in one set but not the other.
	 * 
	 * @param a
	 * @param b
	 * @return The symmetric difference of the two given sets.
	 */
	public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) {
		return null;
	}

	/**
	 * This method returns a new set representing the Cartesian product of the
	 * two given sets.
	 * 
	 * @param a
	 * @param b
	 * @return The Cartesian product of the two given sets.
	 */
	public static <S, T> Set<Pair<S, T>> cartesianProduct(Set<S> a, Set<T> b) {
		return null;
	}

}