import java.lang.String;

public class unit{

	public Object removeA(String string) {
		String result="";

			for(int i=0;i<string.length();i++)
			{
				if(string.charAt(i)=='A' && i<2)
				{
					result+="";
				}
				else
				{

				   result+=""+string.charAt(i);
				}
			}


			return result;

		}


	}
