package com.whitewolfstudios.witchhunt;

/**
 * Created by Rose on 11/19/2016.
 */

public enum SpaceType {

    Passable(true,true,true,true),
    InPassAble(false,false,false,false),
    SeeThrough(true,false,false,false),
    CanPassThrough(true,false,false,true),
    

    boolean canSeeThrough;

    boolean canStandOn;

    boolean canKnightStandOn;

    boolean canKMoveOn;

    SpaceType(boolean canSeeThrough, boolean canStandOn, boolean canKnightStandOn, boolean canMoveOn) {

        this.canKMoveOn=canMoveOn;
        this.canKnightStandOn = canKnightStandOn;
        this.canSeeThrough = canSeeThrough;
        this.canStandOn = canStandOn;
    }


}
