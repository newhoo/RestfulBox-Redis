package io.github.newhoo.restkit.ext.redis;

import com.intellij.icons.AllIcons;
import io.github.newhoo.restkit.open.RestItemDetail;
import io.github.newhoo.restkit.open.ep.RestItemDetailProvider;
import io.github.newhoo.restkit.open.model.api.RestItem;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RedisRestItemDetail implements RestItemDetail {
    @Override
    public @NotNull String getProtocol() {
        return "redis";
    }

    @Override
    public String asSearchCommandInSearchEvery() {
        return "Search redis commands";
    }

    @Override
    public @NotNull Icon getIcon(@NotNull RestItem restItem) {
        return AllIcons.Providers.Redis;
    }

    public static class RedisRestItemDetailProvider implements RestItemDetailProvider {
        @Override
        public @NotNull RedisRestItemDetail createRestItemDetail() {
            return new RedisRestItemDetail();
        }
    }
}
