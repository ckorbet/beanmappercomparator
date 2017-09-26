package comparator.mapstruct;

import comparator.bean.Dest;
import comparator.bean.Source;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-09-26T16:01:08+0200",
    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_144 (Oracle Corporation)"
)
public class MapStructSourceToDestMapperImpl implements MapStructSourceToDestMapper {

    @Override
    public Dest sourceToDest(Source source) {
        if ( source == null ) {
            return null;
        }

        Dest dest = new Dest();

        dest.setName( source.getName() );
        dest.setAge( source.getAge() );

        return dest;
    }

    @Override
    public Source destToSource(Dest dest) {
        if ( dest == null ) {
            return null;
        }

        Source source = new Source();

        source.setName( dest.getName() );
        source.setAge( dest.getAge() );

        return source;
    }
}
