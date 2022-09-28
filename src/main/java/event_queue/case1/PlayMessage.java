package event_queue.case1;

import javax.sound.sampled.AudioInputStream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The Event Queue's queue will store the instances of this class.
 */
@Getter
@AllArgsConstructor
public class PlayMessage {

  private final AudioInputStream stream;

  @Setter
  private float volume;
}
