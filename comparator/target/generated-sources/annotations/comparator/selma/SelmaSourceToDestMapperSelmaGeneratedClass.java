// GENERATED BY S3LM4
package comparator.selma;


public final class SelmaSourceToDestMapperSelmaGeneratedClass
    implements SelmaSourceToDestMapper {

  @Override
  public final comparator.bean.Dest sourceToDest(comparator.bean.Source inSource) {
    comparator.bean.Dest out = null;
    if (inSource != null) {
      out = new comparator.bean.Dest();
      out.setAge(inSource.getAge());
      out.setName(inSource.getName());
    }
    return out;
  }


  @Override
  public final comparator.bean.Source destToTSource(comparator.bean.Dest inDest) {
    comparator.bean.Source out = null;
    if (inDest != null) {
      out = new comparator.bean.Source();
      out.setAge(inDest.getAge());
      out.setName(inDest.getName());
    }
    return out;
  }



  /**
   * Single constructor
   */
  public SelmaSourceToDestMapperSelmaGeneratedClass() {
  }

}
