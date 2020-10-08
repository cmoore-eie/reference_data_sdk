package blog.userfunction.sdk.builders;


import blog.userfunction.sdk.model.DealerLocation;

import java.util.Date;
import java.util.UUID;

public class DealerLocationBuilder {

    DealerLocation builtObject;

    public DealerLocationBuilder(){
        builtObject = new DealerLocation();
    }

    public DealerLocation getDealerLocation(){
        return builtObject;
    }

    public DealerLocationBuilder withAddressLine1(String inItem){
        builtObject.setAddressLine1(inItem);
        return this;
    }

    public DealerLocationBuilder withAddressLine2(String inItem){
        builtObject.setAddressLine2(inItem);
        return this;
    }

    public DealerLocationBuilder withCity(String inItem){
        builtObject.setCity(inItem);
        return this;
    }

    public DealerLocationBuilder withLocationName(String inItem){
        builtObject.setLocationName(inItem);
        return this;
    }

    public DealerLocationBuilder withPostCode(String inItem){
        builtObject.setPostCode(inItem);
        return this;
    }
}
