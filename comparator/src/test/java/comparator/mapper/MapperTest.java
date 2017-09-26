package comparator.mapper;

import org.dozer.DozerBeanMapper;
import org.junit.Assert;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import comparator.bean.Dest;
import comparator.bean.Source;
import comparator.mapstruct.MapStructSourceToDestMapper;
import comparator.selma.SelmaSourceToDestMapper;
import fr.xebia.extras.selma.Selma;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class MapperTest {
	
	//given
	private static final Source SOURCE = new Source("Carlos", "35");
		
	@Test
	public final void DozerTest() {
		//when
		final Long start = System.currentTimeMillis();
		final DozerBeanMapper dozerMapper = new DozerBeanMapper();
		final Dest dest = dozerMapper.map(SOURCE, Dest.class);
		System.out.println("Dozer Mapping took: " + (System.currentTimeMillis() - start) + " millis.");
		
		//then
		Assert.assertNotNull("Dest bean must not be null", dest);
		Assert.assertEquals("Name must be the same in both beans", SOURCE.getName(), dest.getName());
		Assert.assertEquals("Age must be the same in both beans", SOURCE.getName(), dest.getName());		
	}
	
	@Test
	public final void MapStructTest() {
		//when
		final Long start = System.currentTimeMillis();
		final MapStructSourceToDestMapper msMapper = Mappers.getMapper(MapStructSourceToDestMapper.class);
		final Dest dest = msMapper.sourceToDest(SOURCE);
		//final Dest dest = MapStructSourceToDestMapper.getInstance().sourceToDest(source);
		System.out.println("MapStruct Mapping took: " + (System.currentTimeMillis() - start) + " millis.");
		
		//then
		Assert.assertNotNull("Dest bean must not be null", dest);
		Assert.assertEquals("Name must be the same in both beans", SOURCE.getName(), dest.getName());
		Assert.assertEquals("Age must be the same in both beans", SOURCE.getName(), dest.getName());		
	}
	
	@Test
	public final void OrikaTest() {
		//when
		final Long start = System.currentTimeMillis();
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		mapperFactory.classMap(Source.class, Dest.class);
		final MapperFacade orikaMapper = mapperFactory.getMapperFacade();
		final Dest dest = orikaMapper.map(SOURCE, Dest.class);
		System.out.println("Orika Mapping took: " + (System.currentTimeMillis() - start) + " millis.");
		
		//then
		Assert.assertNotNull("Dest bean must not be null", dest);
		Assert.assertEquals("Name must be the same in both beans", SOURCE.getName(), dest.getName());
		Assert.assertEquals("Age must be the same in both beans", SOURCE.getName(), dest.getName());		
	}
	
	@Test
	public final void SelmaTest() {
		//when
		final Long start = System.currentTimeMillis();
		//final SelmaSourceToDestMapper selmaMapper = Selma.builder(SelmaSourceToDestMapper.class).build();
		final SelmaSourceToDestMapper selmaMapper = Selma.mapper(SelmaSourceToDestMapper.class);
		final Dest dest = selmaMapper.sourceToDest(SOURCE);
		System.out.println("Selma Mapping took: " + (System.currentTimeMillis() - start) + " millis.");
		
		//then
		Assert.assertNotNull("Dest bean must not be null", dest);
		Assert.assertEquals("Name must be the same in both beans", SOURCE.getName(), dest.getName());
		Assert.assertEquals("Age must be the same in both beans", SOURCE.getName(), dest.getName());		
	}

}