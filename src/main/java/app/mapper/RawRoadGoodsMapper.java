package app.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import app.model.raw.RoadGoodsRawData;

@Mapper
public interface RawRoadGoodsMapper {
	@Insert("INSERT INTO rawroadgoods(PLATE_NUMBER,REPORT_TIME,INDUSTRY,AREA_NAME,"
			+ "COMPANY_ID,VEHICLE_SUM,FUEL_TYPE,TOTAL_FUEL,TRANSPORT_TURNOVER,CAR_TYPE,"
			+ "APPROVED_CARGO,RANGE_ABILITY) "
			+ "VALUES(#{PLATE_NUMBER},#{REPORT_TIME},#{INDUSTRY},"
			+ "#{AREA_NAME},#{COMPANY_ID},#{VEHICLE_SUM},#{FUEL_TYPE},#{TOTAL_FUEL},"
			+ "#{TRANSPORT_TURNOVER},#{CAR_TYPE},#{APPROVED_CARGO},#{RANGE_ABILITY})")
	public void add(RoadGoodsRawData rfRawData);
	
	

}
