package blog.userfunction.sdk.builders;


import blog.userfunction.sdk.model.Dealer;
import blog.userfunction.sdk.model.DealerLocation;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class DealerBuilder {

    Dealer builtObject;

    public DealerBuilder(){
        builtObject = new Dealer();
    }

    public Dealer getDealer(){
        return builtObject;
    }

    public DealerBuilder withDefaults(){
        withItemIdentifier(UUID.randomUUID().toString());
        return this;
    }

    public DealerBuilder withItemIdentifier(String inItem) {
        builtObject.setItemIdentifier(inItem);
        return this;
    }

    public DealerBuilder withEffectiveDate(Date inItem) {
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public DealerBuilder withExpirationDate(Date inItem) {
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public DealerBuilder withCreateTime(Date inItem) {
        builtObject.setCreateTime(inItem);
        return this;
    }

    public DealerBuilder withUpdateTime(Date inItem) {
        builtObject.setUpdateTime(inItem);
        return this;
    }

    public DealerBuilder withCode(String inItem) {
        builtObject.setCode(inItem);
        return this;
    }

    public DealerBuilder withLocked(boolean inItem) {
        builtObject.setLocked(inItem);
        return this;
    }

    public DealerBuilder withName(String inItem) {
        builtObject.setName(inItem);
        return this;
    }

    public DealerBuilder withDealerLocations(DealerLocation inItem){
        if(builtObject.getLocations() == null){
            builtObject.setLocations(new ArrayList<DealerLocation>());
        }
        builtObject.addLocationsItem(inItem);
        return this;
    }
}
