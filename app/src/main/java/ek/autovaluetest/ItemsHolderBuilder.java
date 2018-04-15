package ek.autovaluetest;

import java.util.List;

public interface ItemsHolderBuilder<Self extends ItemsHolderBuilder<Self, T>, T> {
    Self setItems(List<T> items);
}
