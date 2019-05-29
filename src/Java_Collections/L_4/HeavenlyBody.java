package Java_Collections.L_4;

import java.util.HashSet;
import java.util.Set;

public  abstract class HeavenlyBody {
    private  final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellities;



    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }



    public HeavenlyBody(String name, double orbitalPeriod,BodyTypes bodyType) {

        this.key = new Key(name,bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellities = new HashSet<>();


    }



    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }


    public boolean addSatellite(HeavenlyBody moon){
        return this.satellities.add(moon);
    }

    public Set<HeavenlyBody> getSatelities(){
        return new HashSet<>(this.satellities);
    }


    @Override
    public  final boolean equals(Object obj) {
        if( this == obj){
            return true;
        }

       if(obj instanceof HeavenlyBody) {
        HeavenlyBody theObject = (HeavenlyBody) obj;
        return this.key.equals(theObject.getKey());
       }
           return false;

    }

    @Override
    public final  int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name,BodyTypes bodyType){
        return new Key(name,bodyType);
    }


    @Override
    public String toString() {
        return this.key + ": " + this.key.bodyType + " , " + this.orbitalPeriod;
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        public Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyType = bodyTypes;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
          Key key  = (Key) obj;
          if(this.name.equals(key.getName())) {
              return (this.bodyType == key.getBodyType());
          }
          return false;
        }


        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
