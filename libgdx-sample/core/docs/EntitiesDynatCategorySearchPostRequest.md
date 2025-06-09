

# EntitiesDynatCategorySearchPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filter** | **String** | JSON with filter definition |  [optional] |
|**dynamicAttributes** | **Boolean** | Specifies whether entity dynamic attributes should be returned. |  [optional] |
|**returnCount** | **Boolean** | Specifies whether the total count of entities should be returned in the &#39;X-Total-Count&#39; header. |  [optional] |
|**offset** | **String** | Position of the first result to retrieve. |  [optional] |
|**returnNulls** | **Boolean** | Specifies whether null fields will be written to the result JSON. |  [optional] |
|**limit** | **String** | Number of extracted entities. |  [optional] |
|**sort** | **String** | Name of the field to be sorted by. If the name is preceding by the &#39;+&#39; character, then the sort order is ascending, if by the &#39;-&#39; character then descending. If there is no special character before the property name, then ascending sort will be used. |  [optional] |
|**fetchPlan** | **String** | Name of the fetchPlan which is used for loading the entity. |  [optional] |



