package _31_Generic.WildCard.UpperBoundedWildCard;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Box<T> {
    private T item;
}
