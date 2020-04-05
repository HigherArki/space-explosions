package bellosqueues.spaceexplosions.persistence.model;

import bellosqueues.spaceexplosions.services.utilities.Direction;

/**
 * Programming for the Interface
 */
public interface Model {

   int getPositionX();

   int getPositionY();

   int getSpeed();

   int getDamage();

   void setPositionX(int positionX);

   void setPositionY(int positionY);

   void setSpeed(int speed);

   void setDamage(int damage);

   void move(Direction direction);
}
