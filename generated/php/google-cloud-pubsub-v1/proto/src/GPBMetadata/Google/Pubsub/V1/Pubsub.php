<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/pubsub/v1/pubsub.proto

namespace GPBMetadata\Google\Pubsub\V1;

class Pubsub
{
    public static $is_initialized = false;

    public static function initOnce() {
        $pool = \Google\Protobuf\Internal\DescriptorPool::getGeneratedPool();

        if (static::$is_initialized == true) {
          return;
        }
        \GPBMetadata\Google\Api\Annotations::initOnce();
        \GPBMetadata\Google\Protobuf\Duration::initOnce();
        \GPBMetadata\Google\Protobuf\GPBEmpty::initOnce();
        \GPBMetadata\Google\Protobuf\FieldMask::initOnce();
        \GPBMetadata\Google\Protobuf\Timestamp::initOnce();
        $pool->internalAddGeneratedFile(hex2bin(
            "0ad02e0a1d676f6f676c652f7075627375622f76312f7075627375622e70" .
            "726f746f1210676f6f676c652e7075627375622e76311a1e676f6f676c65" .
            "2f70726f746f6275662f6475726174696f6e2e70726f746f1a1b676f6f67" .
            "6c652f70726f746f6275662f656d7074792e70726f746f1a20676f6f676c" .
            "652f70726f746f6275662f6669656c645f6d61736b2e70726f746f1a1f67" .
            "6f6f676c652f70726f746f6275662f74696d657374616d702e70726f746f" .
            "22150a05546f706963120c0a046e616d6518012001280922db010a0d5075" .
            "627375624d657373616765120c0a046461746118012001280c12430a0a61" .
            "74747269627574657318022003280b322f2e676f6f676c652e7075627375" .
            "622e76312e5075627375624d6573736167652e4174747269627574657345" .
            "6e74727912120a0a6d6573736167655f696418032001280912300a0c7075" .
            "626c6973685f74696d6518042001280b321a2e676f6f676c652e70726f74" .
            "6f6275662e54696d657374616d701a310a0f41747472696275746573456e" .
            "747279120b0a036b6579180120012809120d0a0576616c75651802200128" .
            "093a02380122200a0f476574546f70696352657175657374120d0a05746f" .
            "70696318012001280922520a0e5075626c69736852657175657374120d0a" .
            "05746f70696318012001280912310a086d6573736167657318022003280b" .
            "321f2e676f6f676c652e7075627375622e76312e5075627375624d657373" .
            "61676522260a0f5075626c697368526573706f6e736512130a0b6d657373" .
            "6167655f696473180120032809224b0a114c697374546f70696373526571" .
            "75657374120f0a0770726f6a65637418012001280912110a09706167655f" .
            "73697a6518022001280512120a0a706167655f746f6b656e180320012809" .
            "22560a124c697374546f70696373526573706f6e736512270a06746f7069" .
            "637318012003280b32172e676f6f676c652e7075627375622e76312e546f" .
            "70696312170a0f6e6578745f706167655f746f6b656e1802200128092255" .
            "0a1d4c697374546f706963537562736372697074696f6e73526571756573" .
            "74120d0a05746f70696318012001280912110a09706167655f73697a6518" .
            "022001280512120a0a706167655f746f6b656e18032001280922500a1e4c" .
            "697374546f706963537562736372697074696f6e73526573706f6e736512" .
            "150a0d737562736372697074696f6e7318012003280912170a0f6e657874" .
            "5f706167655f746f6b656e18022001280922230a1244656c657465546f70" .
            "696352657175657374120d0a05746f70696318012001280922da010a0c53" .
            "7562736372697074696f6e120c0a046e616d65180120012809120d0a0574" .
            "6f70696318022001280912310a0b707573685f636f6e6669671804200128" .
            "0b321c2e676f6f676c652e7075627375622e76312e50757368436f6e6669" .
            "67121c0a1461636b5f646561646c696e655f7365636f6e64731805200128" .
            "05121d0a1572657461696e5f61636b65645f6d6573736167657318072001" .
            "2808123d0a1a6d6573736167655f726574656e74696f6e5f647572617469" .
            "6f6e18082001280b32192e676f6f676c652e70726f746f6275662e447572" .
            "6174696f6e2298010a0a50757368436f6e66696712150a0d707573685f65" .
            "6e64706f696e7418012001280912400a0a61747472696275746573180220" .
            "03280b322c2e676f6f676c652e7075627375622e76312e50757368436f6e" .
            "6669672e41747472696275746573456e7472791a310a0f41747472696275" .
            "746573456e747279120b0a036b6579180120012809120d0a0576616c7565" .
            "1802200128093a02380122530a0f52656365697665644d65737361676512" .
            "0e0a0661636b5f696418012001280912300a076d65737361676518022001" .
            "280b321f2e676f6f676c652e7075627375622e76312e5075627375624d65" .
            "7373616765222e0a16476574537562736372697074696f6e526571756573" .
            "7412140a0c737562736372697074696f6e1801200128092282010a195570" .
            "64617465537562736372697074696f6e5265717565737412340a0c737562" .
            "736372697074696f6e18012001280b321e2e676f6f676c652e7075627375" .
            "622e76312e537562736372697074696f6e122f0a0b7570646174655f6d61" .
            "736b18022001280b321a2e676f6f676c652e70726f746f6275662e466965" .
            "6c644d61736b22520a184c697374537562736372697074696f6e73526571" .
            "75657374120f0a0770726f6a65637418012001280912110a09706167655f" .
            "73697a6518022001280512120a0a706167655f746f6b656e180320012809" .
            "226b0a194c697374537562736372697074696f6e73526573706f6e736512" .
            "350a0d737562736372697074696f6e7318012003280b321e2e676f6f676c" .
            "652e7075627375622e76312e537562736372697074696f6e12170a0f6e65" .
            "78745f706167655f746f6b656e18022001280922310a1944656c65746553" .
            "7562736372697074696f6e5265717565737412140a0c7375627363726970" .
            "74696f6e18012001280922620a174d6f6469667950757368436f6e666967" .
            "5265717565737412140a0c737562736372697074696f6e18012001280912" .
            "310a0b707573685f636f6e66696718022001280b321c2e676f6f676c652e" .
            "7075627375622e76312e50757368436f6e66696722550a0b50756c6c5265" .
            "717565737412140a0c737562736372697074696f6e180120012809121a0a" .
            "1272657475726e5f696d6d6564696174656c7918022001280812140a0c6d" .
            "61785f6d65737361676573180320012805224c0a0c50756c6c526573706f" .
            "6e7365123c0a1172656365697665645f6d6573736167657318012003280b" .
            "32212e676f6f676c652e7075627375622e76312e52656365697665644d65" .
            "7373616765225f0a184d6f6469667941636b446561646c696e6552657175" .
            "65737412140a0c737562736372697074696f6e180120012809120f0a0761" .
            "636b5f696473180420032809121c0a1461636b5f646561646c696e655f73" .
            "65636f6e6473180320012805223b0a1241636b6e6f776c65646765526571" .
            "7565737412140a0c737562736372697074696f6e180120012809120f0a07" .
            "61636b5f69647318022003280922a4010a1453747265616d696e6750756c" .
            "6c5265717565737412140a0c737562736372697074696f6e180120012809" .
            "120f0a0761636b5f696473180220032809121f0a176d6f646966795f6465" .
            "61646c696e655f7365636f6e6473180320032805121f0a176d6f64696679" .
            "5f646561646c696e655f61636b5f69647318042003280912230a1b737472" .
            "65616d5f61636b5f646561646c696e655f7365636f6e6473180520012805" .
            "22550a1553747265616d696e6750756c6c526573706f6e7365123c0a1172" .
            "656365697665645f6d6573736167657318012003280b32212e676f6f676c" .
            "652e7075627375622e76312e52656365697665644d657373616765223b0a" .
            "15437265617465536e617073686f7452657175657374120c0a046e616d65" .
            "18012001280912140a0c737562736372697074696f6e1802200128092258" .
            "0a08536e617073686f74120c0a046e616d65180120012809120d0a05746f" .
            "706963180220012809122f0a0b6578706972655f74696d6518032001280b" .
            "321a2e676f6f676c652e70726f746f6275662e54696d657374616d70224e" .
            "0a144c697374536e617073686f747352657175657374120f0a0770726f6a" .
            "65637418012001280912110a09706167655f73697a651802200128051212" .
            "0a0a706167655f746f6b656e180320012809225f0a154c697374536e6170" .
            "73686f7473526573706f6e7365122d0a09736e617073686f747318012003" .
            "280b321a2e676f6f676c652e7075627375622e76312e536e617073686f74" .
            "12170a0f6e6578745f706167655f746f6b656e18022001280922290a1544" .
            "656c657465536e617073686f745265717565737412100a08736e61707368" .
            "6f74180120012809226d0a0b5365656b5265717565737412140a0c737562" .
            "736372697074696f6e180120012809122a0a0474696d6518022001280b32" .
            "1a2e676f6f676c652e70726f746f6275662e54696d657374616d70480012" .
            "120a08736e617073686f74180320012809480042080a0674617267657422" .
            "0e0a0c5365656b526573706f6e736532e80f0a0a53756273637269626572" .
            "1286010a12437265617465537562736372697074696f6e121e2e676f6f67" .
            "6c652e7075627375622e76312e537562736372697074696f6e1a1e2e676f" .
            "6f676c652e7075627375622e76312e537562736372697074696f6e223082" .
            "d3e493022a1a252f76312f7b6e616d653d70726f6a656374732f2a2f7375" .
            "62736372697074696f6e732f2a7d3a012a1292010a0f4765745375627363" .
            "72697074696f6e12282e676f6f676c652e7075627375622e76312e476574" .
            "537562736372697074696f6e526571756573741a1e2e676f6f676c652e70" .
            "75627375622e76312e537562736372697074696f6e223582d3e493022f12" .
            "2d2f76312f7b737562736372697074696f6e3d70726f6a656374732f2a2f" .
            "737562736372697074696f6e732f2a7d12a0010a12557064617465537562" .
            "736372697074696f6e122b2e676f6f676c652e7075627375622e76312e55" .
            "7064617465537562736372697074696f6e526571756573741a1e2e676f6f" .
            "676c652e7075627375622e76312e537562736372697074696f6e223d82d3" .
            "e493023732322f76312f7b737562736372697074696f6e2e6e616d653d70" .
            "726f6a656374732f2a2f737562736372697074696f6e732f2a7d3a012a12" .
            "9c010a114c697374537562736372697074696f6e73122a2e676f6f676c65" .
            "2e7075627375622e76312e4c697374537562736372697074696f6e735265" .
            "71756573741a2b2e676f6f676c652e7075627375622e76312e4c69737453" .
            "7562736372697074696f6e73526573706f6e7365222e82d3e49302281226" .
            "2f76312f7b70726f6a6563743d70726f6a656374732f2a7d2f7375627363" .
            "72697074696f6e731290010a1244656c657465537562736372697074696f" .
            "6e122b2e676f6f676c652e7075627375622e76312e44656c657465537562" .
            "736372697074696f6e526571756573741a162e676f6f676c652e70726f74" .
            "6f6275662e456d707479223582d3e493022f2a2d2f76312f7b7375627363" .
            "72697074696f6e3d70726f6a656374732f2a2f737562736372697074696f" .
            "6e732f2a7d12a3010a114d6f6469667941636b446561646c696e65122a2e" .
            "676f6f676c652e7075627375622e76312e4d6f6469667941636b44656164" .
            "6c696e65526571756573741a162e676f6f676c652e70726f746f6275662e" .
            "456d707479224a82d3e4930244223f2f76312f7b73756273637269707469" .
            "6f6e3d70726f6a656374732f2a2f737562736372697074696f6e732f2a7d" .
            "3a6d6f6469667941636b446561646c696e653a012a1291010a0b41636b6e" .
            "6f776c6564676512242e676f6f676c652e7075627375622e76312e41636b" .
            "6e6f776c65646765526571756573741a162e676f6f676c652e70726f746f" .
            "6275662e456d707479224482d3e493023e22392f76312f7b737562736372" .
            "697074696f6e3d70726f6a656374732f2a2f737562736372697074696f6e" .
            "732f2a7d3a61636b6e6f776c656467653a012a1284010a0450756c6c121d" .
            "2e676f6f676c652e7075627375622e76312e50756c6c526571756573741a" .
            "1e2e676f6f676c652e7075627375622e76312e50756c6c526573706f6e73" .
            "65223d82d3e493023722322f76312f7b737562736372697074696f6e3d70" .
            "726f6a656374732f2a2f737562736372697074696f6e732f2a7d3a70756c" .
            "6c3a012a12640a0d53747265616d696e6750756c6c12262e676f6f676c65" .
            "2e7075627375622e76312e53747265616d696e6750756c6c526571756573" .
            "741a272e676f6f676c652e7075627375622e76312e53747265616d696e67" .
            "50756c6c526573706f6e73652801300112a0010a104d6f64696679507573" .
            "68436f6e66696712292e676f6f676c652e7075627375622e76312e4d6f64" .
            "69667950757368436f6e666967526571756573741a162e676f6f676c652e" .
            "70726f746f6275662e456d707479224982d3e4930243223e2f76312f7b73" .
            "7562736372697074696f6e3d70726f6a656374732f2a2f73756273637269" .
            "7074696f6e732f2a7d3a6d6f6469667950757368436f6e6669673a012a12" .
            "8c010a0d4c697374536e617073686f747312262e676f6f676c652e707562" .
            "7375622e76312e4c697374536e617073686f7473526571756573741a272e" .
            "676f6f676c652e7075627375622e76312e4c697374536e617073686f7473" .
            "526573706f6e7365222a82d3e493022412222f76312f7b70726f6a656374" .
            "3d70726f6a656374732f2a7d2f736e617073686f74731283010a0e437265" .
            "617465536e617073686f7412272e676f6f676c652e7075627375622e7631" .
            "2e437265617465536e617073686f74526571756573741a1a2e676f6f676c" .
            "652e7075627375622e76312e536e617073686f74222c82d3e49302261a21" .
            "2f76312f7b6e616d653d70726f6a656374732f2a2f736e617073686f7473" .
            "2f2a7d3a012a1280010a0e44656c657465536e617073686f7412272e676f" .
            "6f676c652e7075627375622e76312e44656c657465536e617073686f7452" .
            "6571756573741a162e676f6f676c652e70726f746f6275662e456d707479" .
            "222d82d3e49302272a252f76312f7b736e617073686f743d70726f6a6563" .
            "74732f2a2f736e617073686f74732f2a7d1284010a045365656b121d2e67" .
            "6f6f676c652e7075627375622e76312e5365656b526571756573741a1e2e" .
            "676f6f676c652e7075627375622e76312e5365656b526573706f6e736522" .
            "3d82d3e493023722322f76312f7b737562736372697074696f6e3d70726f" .
            "6a656374732f2a2f737562736372697074696f6e732f2a7d3a7365656b3a" .
            "012a329b060a095075626c6973686572126a0a0b437265617465546f7069" .
            "6312172e676f6f676c652e7075627375622e76312e546f7069631a172e67" .
            "6f6f676c652e7075627375622e76312e546f706963222982d3e49302231a" .
            "1e2f76312f7b6e616d653d70726f6a656374732f2a2f746f706963732f2a" .
            "7d3a012a1282010a075075626c69736812202e676f6f676c652e70756273" .
            "75622e76312e5075626c697368526571756573741a212e676f6f676c652e" .
            "7075627375622e76312e5075626c697368526573706f6e7365223282d3e4" .
            "93022c22272f76312f7b746f7069633d70726f6a656374732f2a2f746f70" .
            "6963732f2a7d3a7075626c6973683a012a126f0a08476574546f70696312" .
            "212e676f6f676c652e7075627375622e76312e476574546f706963526571" .
            "756573741a172e676f6f676c652e7075627375622e76312e546f70696322" .
            "2782d3e4930221121f2f76312f7b746f7069633d70726f6a656374732f2a" .
            "2f746f706963732f2a7d1280010a0a4c697374546f7069637312232e676f" .
            "6f676c652e7075627375622e76312e4c697374546f706963735265717565" .
            "73741a242e676f6f676c652e7075627375622e76312e4c697374546f7069" .
            "6373526573706f6e7365222782d3e4930221121f2f76312f7b70726f6a65" .
            "63743d70726f6a656374732f2a7d2f746f7069637312b2010a164c697374" .
            "546f706963537562736372697074696f6e73122f2e676f6f676c652e7075" .
            "627375622e76312e4c697374546f706963537562736372697074696f6e73" .
            "526571756573741a302e676f6f676c652e7075627375622e76312e4c6973" .
            "74546f706963537562736372697074696f6e73526573706f6e7365223582" .
            "d3e493022f122d2f76312f7b746f7069633d70726f6a656374732f2a2f74" .
            "6f706963732f2a7d2f737562736372697074696f6e7312740a0b44656c65" .
            "7465546f70696312242e676f6f676c652e7075627375622e76312e44656c" .
            "657465546f706963526571756573741a162e676f6f676c652e70726f746f" .
            "6275662e456d707479222782d3e49302212a1f2f76312f7b746f7069633d" .
            "70726f6a656374732f2a2f746f706963732f2a7d42790a14636f6d2e676f" .
            "6f676c652e7075627375622e7631420b50756273756250726f746f50015a" .
            "36676f6f676c652e676f6c616e672e6f72672f67656e70726f746f2f676f" .
            "6f676c65617069732f7075627375622f76313b707562737562f80101aa02" .
            "16476f6f676c652e436c6f75642e5075625375622e5631620670726f746f" .
            "33"
        ));

        static::$is_initialized = true;
    }
}
