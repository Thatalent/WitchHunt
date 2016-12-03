package com.whitewolfstudios.witchhunt;

/**
 * Created by Rose on 11/19/2016.
 */

public enum SpaceType {


    BLANKSPACE(true,true,true,true),
    IN_PASS_ABLE(false,false,false,false),
    SEE_THROUGH(true,false,false,false),
    CAN_PASS_THROUGH(true,false,false,true),
    RESOURCE_SPACE(true,true,false,true),
    FOG_SPACE(false,true,true,true),
    HIDDEN_SPACE(false,false,false,true),
    KING_SPACE(true);

    boolean canSeeThrough;

    boolean canStandOn;

    boolean canKnightStandOn;

    boolean canKMoveThrough;

    boolean kingSpace;

    SpaceType(boolean canSeeThrough, boolean canStandOn, boolean canKnightStandOn, boolean canMoveThrough) {

        this.canKMoveThrough =canMoveThrough;
        this.canKnightStandOn = canKnightStandOn;
        this.canSeeThrough = canSeeThrough;
        this.canStandOn = canStandOn;
    }

    SpaceType(boolean kingSpace) {

        this.kingSpace = kingSpace;
    }

}
