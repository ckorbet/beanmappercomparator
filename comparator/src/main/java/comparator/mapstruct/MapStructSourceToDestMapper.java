package comparator.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import comparator.bean.Dest;
import comparator.bean.Source;

@Mapper
public interface MapStructSourceToDestMapper {
	
	//static MapStructSourceToDestMapper getInstance() { return Mappers.getMapper(MapStructSourceToDestMapper.class); };
	
	Dest sourceToDest(Source source);
	
	Source destToSource(Dest dest);
}
