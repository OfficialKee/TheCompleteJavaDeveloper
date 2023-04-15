import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movieArray = new ArrayList<>();


        Movie movie1 = new Movie("The Shawshank Redemption", "BlueRay", 9.2);
        Movie movie2 = new Movie("The Godfather", "BlueRay", 9.1);
        Movie movie3 = new Movie("The Godfather: Part II", "DVD", 9.0);
        Movie movie4 = new Movie("The Dark Knight", "BlueRay", 9.0);
        Movie movie5 = new Movie("Schindler's List", "DVD", 8.9);
        Movie movie6 = new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9);
        Movie movie7 = new Movie("Pulp Fiction", "DVD", 8.8);
        Movie movie8 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8);
        
        movieArray.add(movie1);
        movieArray.add(movie2);
        movieArray.add(movie3);
        movieArray.add(movie4);
        movieArray.add(movie5);
        movieArray.add(movie6);
        movieArray.add(movie7);
        movieArray.add(movie8);

        printToString(movieArray);
    
    }

    public static void printToString(ArrayList<Movie> movieArray) {
        for (Movie film: movieArray) {
            System.out.println(film);
            
        }
        
    }
}