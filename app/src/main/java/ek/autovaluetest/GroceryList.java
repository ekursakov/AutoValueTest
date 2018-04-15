package ek.autovaluetest;

import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
public abstract class GroceryList implements ItemsHolder<GroceryItem> {

    // if this method is absent then
    // Error:(17, 33) error: Parameter type java.util.List<ek.autovaluetest.GroceryItem> of setter method should be java.util.List<T> to match getter ek.autovaluetest.GroceryList.getItems
    public abstract List<GroceryItem> getItems();

    @AutoValue.Builder
    public abstract static class Builder implements ItemsHolderBuilder<Builder, GroceryItem> {

        // if this method is absent then
        // Error:(9, 14) error: Parameter type java.util.List<T> of setter method should be java.util.List<ek.autovaluetest.GroceryItem> to match getter ek.autovaluetest.GroceryList.getItems
        public abstract Builder setItems(List<GroceryItem> items);

        public abstract GroceryList build();
    }
}
