package comparator.selma;

import comparator.bean.Dest;
import comparator.bean.Source;
import fr.xebia.extras.selma.Mapper;

@Mapper
public interface SelmaSourceToDestMapper {
	
	Dest sourceToDest(Source source);
	
	Source destToTSource(Dest dest);

}
