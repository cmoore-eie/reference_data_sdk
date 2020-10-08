package blog.userfunction.sdk.builders;

import blog.userfunction.sdk.ApiClient;
import blog.userfunction.sdk.api.GenderApi;
import blog.userfunction.sdk.model.Gender;

import java.util.Date;
import java.util.UUID;

public class GenderBuilder {

    Gender builtObject;

    public GenderBuilder() {
        builtObject = new Gender();
    }

    public GenderBuilder withDefaults() {
        withItemIdentifier(UUID.randomUUID().toString());
        return this;
    }

    public Gender getGender() {
        return builtObject;
    }

    public GenderBuilder withItemIdentifier(String inItem) {
        builtObject.setItemUuid(inItem);
        return this;
    }

    public GenderBuilder withEffectiveDate(Date inItem) {
        builtObject.setEffectiveDate(inItem);
        return this;
    }

    public GenderBuilder withExpirationDate(Date inItem) {
        builtObject.setExpirationDate(inItem);
        return this;
    }

    public GenderBuilder withCreateTime(Date inItem) {
        builtObject.setCreateTime(inItem);
        return this;
    }

    public GenderBuilder withUpdateTime(Date inItem) {
        builtObject.setUpdateTime(inItem);
        return this;
    }

    public GenderBuilder withCode(String inItem) {
        builtObject.setCode(inItem);
        return this;
    }

    public GenderBuilder withLocked(boolean inItem) {
        builtObject.setLocked(inItem);
        return this;
    }

    public GenderBuilder withName(String inItem) {
        builtObject.setName(inItem);
        return this;
    }

    public Gender update() {
        GenderApi api = new ApiClient().buildClient(GenderApi.class);
        return api.genderCreate(builtObject);
    }
}
