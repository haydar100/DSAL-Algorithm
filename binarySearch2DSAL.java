
public class binarySearch2DSAL<T> {
	   int binarySearch2( Comparable<T>[ ] a, int low, int high,T x )
	    {
	    
	        int mid;

	        if( low <= high )
	        {
	            mid = ( low + high ) / 2;
	            System.out.println("mid: " + mid);

	            if( a[mid].compareTo( x ) < 0 ) {
	            	  return binarySearch2(a, mid + 1, high, x);
	            }
	            else if( a[mid].compareTo( x ) > 0 ) {
	            	  return binarySearch2(a, mid - 1, high, x);
	            }
	            else {
	                return mid;
	            }
	        }
	        return -1;

	    }
	   
	   int binarySearch2( Comparable<T>[ ] a, T x ) // zoek element x in 'a'
	   {
		   return binarySearch2( a, 0, a.length-1, x );
	   }
	
	
	
}
