#include "LongestPalindromicSubstringTest.h"

TEST_F(LongestPalindromicSubstringTest, EmptyStringShouldReturnAnEmptyString) {
    std::string s = "";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), s);
}

TEST_F(LongestPalindromicSubstringTest, SingleLengthStringShouldReturnASingleLengthString) {
    std::string s = "a";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), s);
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturnSingleLengthString) {
    std::string s = "abcdef";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), "a");
}

TEST_F(LongestPalindromicSubstringTest, FullPalindromeStringShouldReturnSameString) {
    std::string s = "abcba";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), s);
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturnCorrectOddLengthPalindromicSubstring) {
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome("wjkykqahaqwo"), "qahaq");
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome("abcdbab"), "bab");
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome("aacqahaqbbcse"), "qahaq");
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome("abcdefghaaah"), "haaah");
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturnCorrectEvenLengthPalindromicSubstring) {
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome("aabbcdef"), "aa");
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome("abcdbbfcba"), "bb");
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome("abcddeedf"), "deed");
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturncorrectPalindromicStringForVeryLongString) {
    std::string s = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtus"
                    "jhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkua"
                    "oegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqp"
                    "vjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdj"
                    "ksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytet"
                    "llzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctkl"
                    "pqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoih"
                    "vjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjou"
                    "mczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
    auto t1 = std::chrono::high_resolution_clock::now();
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), "qahaq");
    auto t2 = std::chrono::high_resolution_clock::now();
    auto duration = std::chrono::duration_cast<std::chrono::milliseconds>( t2 - t1 ).count();
    ASSERT_LT(duration, 2000);
}