package com.bitmonlab.osiris.api.map.transferobject;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Polygon", parent=GeometryDTO.class)
public class PolygonDTO extends GeometryDTO{

	@NotNull
	@ApiModelProperty(value="Collection of lineString", required=true)
	private Collection<LineStringDTO> collectionLineStringDTO;

	public Collection<LineStringDTO> getCollectionLineStringDTO() {
		return collectionLineStringDTO;
	}

	public void setCollectionLineStringDTO(
			Collection<LineStringDTO> collectionLineStringDTO) {
		this.collectionLineStringDTO = collectionLineStringDTO;
	}
	
	
}
