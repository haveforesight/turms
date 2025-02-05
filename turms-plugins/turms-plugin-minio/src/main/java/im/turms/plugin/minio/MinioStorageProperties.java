/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.plugin.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author James Chen
 */
@ConfigurationProperties("turms-plugin.minio")
@Data
public class MinioStorageProperties {

    private boolean enabled = true;
    private String endpoint = "http://localhost:9000";
    private String region = "";
    private String accessKey = "minioadmin";
    private String secretKey = "minioadmin";

    @NestedConfigurationProperty
    private Retry retry = new Retry();

    @NestedConfigurationProperty
    private ResourceKey resourceKey = new ResourceKey();

    @Data
    public static class Retry {
        private boolean enabled = true;
        private int initialIntervalMillis = 30 * 1000;
        private int intervalMillis = 30 * 1000;
        private int maxAttempts = 3;
    }

    @Data
    public static class ResourceKey {
        @NestedConfigurationProperty
        private ResourceKeyBase62 base62 = new ResourceKeyBase62();

        @NestedConfigurationProperty
        private ResourceKeyMac mac = new ResourceKeyMac();
    }

    @Data
    public static class ResourceKeyBase62 {
        private boolean enabled;
        private String charset = "s5EW4wypaOFg1AmcLxj9VDnJdozIhKYuCTPvk0MNqe8bBRlQ2SifXr63UHG7Zt";
    }

    @Data
    public static class ResourceKeyMac {
        private boolean enabled;
        /**
         * Default: base64("\u0000turms-im/turms\u0080")
         */
        private String base64Key = "AHR1cm1zLWltL3R1cm1zgA==";
    }
}