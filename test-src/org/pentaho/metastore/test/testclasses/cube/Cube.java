package org.pentaho.metastore.test.testclasses.cube;

import java.util.ArrayList;
import java.util.List;

import org.pentaho.metastore.persist.MetaStoreAttribute;
import org.pentaho.metastore.persist.MetaStoreElementType;

@MetaStoreElementType( name = "Cube", description = "A cube" )
public class Cube {

  public static final String DIMENSION_FACTORY_KEY = "DimensionFactory";

  private String name;

  @MetaStoreAttribute( factoryNameReference = true, factoryNameKey = DIMENSION_FACTORY_KEY )
  private List<Dimension> dimensions;

  @MetaStoreAttribute( factoryNameReference = true, factoryNameKey = DIMENSION_FACTORY_KEY )
  private Dimension junkDimension;

  private List<Kpi> kpis;

  public Cube() {
    dimensions = new ArrayList<Dimension>();
    kpis = new ArrayList<Kpi>();
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName( String name ) {
    this.name = name;
  }

  /**
   * @return the dimensions
   */
  public List<Dimension> getDimensions() {
    return dimensions;
  }

  /**
   * @param dimensions the dimensions to set
   */
  public void setDimensions( List<Dimension> dimensions ) {
    this.dimensions = dimensions;
  }

  /**
   * @return the kpis
   */
  public List<Kpi> getKpis() {
    return kpis;
  }

  /**
   * @param kpis the kpis to set
   */
  public void setKpis( List<Kpi> kpis ) {
    this.kpis = kpis;
  }

  /**
   * @return the junkDimension
   */
  public Dimension getJunkDimension() {
    return junkDimension;
  }

  /**
   * @param junkDimension the junkDimension to set
   */
  public void setJunkDimension( Dimension junkDimension ) {
    this.junkDimension = junkDimension;
  }

}
