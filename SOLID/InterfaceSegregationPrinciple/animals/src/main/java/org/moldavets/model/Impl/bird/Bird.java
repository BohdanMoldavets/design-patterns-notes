package org.moldavets.model.Impl.bird;

import org.moldavets.model.Animal;
import org.moldavets.model.Flyable;
import org.moldavets.model.Propagationable;

public abstract class Bird implements Animal, Flyable, Propagationable {
    public abstract void eat();
    public abstract void fly();
    public abstract void propagate();
}
