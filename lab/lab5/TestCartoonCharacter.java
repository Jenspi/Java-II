import org.junit.*;//Makes JUnit work (annotations, amongst other things)
import static org.junit.Assert.*;//Makes asserts work. Note, Assert methods are static
import java.io.FileNotFoundException;

public class TestCartoonCharacter 
{
	CartoonCharacter rick;
	CartoonCharacter morty;
		
	@Before
	public void setUp()
	{
		rick = new CartoonCharacter("Rick", 70, "Wubba lubba dub dub!\n");
		morty = new CartoonCharacter("Morty", 14, "Aaaaawwwww jeeeeeeezzzz..." + System.getProperty("line.separator"));
	}
	
	@Test
	public void testSerializeCharacterAndDeserializeCharacter(){
		CartoonCharacter character = null;
		CartoonCharacterSerializer.serializeCharacter(rick);
		character = CartoonCharacterSerializer.deserializeCharacter();
		//System.out.println(character);


		assertEquals(character.toString(), rick.toString());
	}
	

}
