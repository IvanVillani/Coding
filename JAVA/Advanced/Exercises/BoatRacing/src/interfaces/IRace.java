package interfaces;

import exeptions.DuplicateModelException;
import models.boat.BaseBoat;

import java.util.List;

public interface IRace
{
    int getDistance();

    int getWindSpeed();

    int getOceanCurrentSpeed();

    Boolean getAllowsMotorboats();

    void addParticipant(BaseBoat boat) throws DuplicateModelException;

    List<BaseBoat> getParticipants();
}
