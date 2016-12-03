package com.whitewolfstudios.witchhunt;

/**
 * Created by Rose on 11/19/2016.
 */

public class GameBoardSpace {

    private SpaceType spaceType;
    private boolean resourcePresent;
    private boolean trapPresent;
    private boolean trapPlaceable;


    public SpaceType getSpaceType()
    {
        return this.spaceType;
    }

    public void setSpaceType(SpaceType spaceType)
    {
        this.spaceType = spaceType;
    }

    public void setResourcePresent(boolean resourcePresent)
    {
        this.resourcePresent = resourcePresent;
    }

    public boolean isResourcePresent()
    {
        return this.resourcePresent;
    }

    public void isTrapPresent() {return this.trapPresent}

    public void setTrapPresent(boolean trapPresent)
    {
        this.trapPresent = trapPresent;
    }

    public void isTrapPlaceable() {return this.trapPlaceable}

    public void setTrapPlaceable(boolean trapPlaceable)
    {
        this.trapPlaceable = trapPlaceable;
    }

    private void setresource(SpaceType spaceType) {
        switch (spaceType) {
            case BLANKSPACE:
                setResourcePresent(false);
                setTrapPlaceable(true);
                break;

            case IN_PASS_ABLE:
                setResourcePresent(false);
                setTrapPlaceable(false);
                break;

            case SEE_THROUGH:
                setResourcePresent(false);
                setTrapPlaceable(false);
                break;

            case CAN_PASS_THROUGH:
                setResourcePresent(false);
                setTrapPlaceable(false);
                break;

            case RESOURCE_SPACE:
                setResourcePresent(true);
                setTrapPlaceable(false);
                break;

            case FOG_SPACE:
                setResourcePresent(false);
                setTrapPlaceable(true);
                break;

            case HIDDEN_SPACE:
                setResourcePresent(false);
                setTrapPlaceable(false);
                break;

            default: break;
        }
    }
}
