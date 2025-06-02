package _31_Generic.WildCard.UnBoundedWildCard;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box<T> {
    private T item;
}
