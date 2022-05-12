package mk.finki.ukim.vebprogramiranjestandardnaseminarska193203.model.exceptions;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super("Product with id"+id+" was not found!");
    }
}
